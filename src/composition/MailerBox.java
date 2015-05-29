package composition;

/**
 * The logic to pack and seal a box is in one place. In fact, MailerBox doesn't 
 * know what kind of box it has. Delegate to Box to actually do the work. This is
 * called method forwarding or method delegation.
 * 
 * Finally, notice that MailerBox is a Mailer and a Box at the same time. This
 * allows us to pass it to any method that needs a Mailer or a Box.
 * 
 * @author miguelangel
 */
public class MailerBox implements Mailer, Box {
    
    Box box;
    
    public MailerBox(Box box){
        this.box = box;
    }

    @Override
    public void addPostage() {
        System.out.println("affix stamps");
    }

    @Override
    public void send() {
        System.out.println("put in mailbox");
    }

    @Override
    public void pack() {
        box.pack();
    }

    @Override
    public void seal() {
        box.seal();
    }
    
    public static void main(String[] args) {
        MailerBox box = new MailerBox(new GiftBox());
        box.pack();
        box.seal();
        box.addPostage();
        box.send();
    }
}

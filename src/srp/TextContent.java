package srp;

public class TextContent implements IEmailContent {

    @Override
    public String getType() {
        return "text";
    }

    @Override
    public String getContent() {
        return "This is text content";
    }
}

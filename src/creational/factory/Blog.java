package creational.factory;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new ContactPage());
        pages.add(new PostPage());
    }
}

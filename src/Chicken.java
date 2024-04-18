class Chicken implements Animal {
    @Override
    public String walk() {
        return "Chicken is pecking around";
    }

    @Override
    public String talk() {
        return "Cheep cheep!";
    }

    @Override
    public String eat() {
        return "Chicken is pecking at food";
    }
}

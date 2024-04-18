class Mouse implements Animal {
    @Override
    public String walk() {
        return "Mouse is scurrying";
    }

    @Override
    public String talk() {
        return "Squeak!";
    }

    @Override
    public String eat() {
        return "Mouse is nibbling";
    }
}
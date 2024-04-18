class Duck implements Animal {
    @Override
    public String walk() {
        return "Duck is waddling";
    }

    @Override
    public String talk() {
        return "Quack!";
    }

    @Override
    public String eat() {
        return "Duck is nibbling on bread";
    }
}
class Opera extends MusicalShow {
    private int choirSize;

    public Opera (String title, int duration, Director director, String musicalAuthor, String librettoText, int choirSize) {
       super(title, duration, director, musicalAuthor, librettoText);
       this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    @Override
    public String toString() {
        return  "Опера \"" + super.getTitle() + "\", размер хора: " + choirSize + " человек";
    }
}

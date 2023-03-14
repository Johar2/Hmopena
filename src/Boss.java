public class Boss {

        private int TheHealth;
        private int TheDamage;
        private String Thedefencetype;


    public Boss(int TheHealth, int TheDamage, String Thedefenceteype) {
        this.TheHealth=TheHealth;
        this.TheDamage=TheDamage;
        this.Thedefencetype=Thedefenceteype;

    }

    public int getTheHealth() {
            return TheHealth;
        }

        public int getTheDamage() {
            return TheDamage;
        }

        public String getThedefencetype() {
            return Thedefencetype;
        }

        public void setTheHealth(int Thehealth) {
            this.TheHealth = Thehealth;

        }

        public void setTheDamage(int Thedamage) {
            this.TheDamage = Thedamage;
        }

        public void setTheDefencetype(String Thedefencetype) {
            this.Thedefencetype = Thedefencetype;
        }

    }


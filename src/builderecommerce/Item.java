package builderecommerce;

public class Item {
    private int id;
    private double cost;
    private String name;
    private String description;

    public static class ItemBuilder {
        private final Item item;

        private ItemBuilder() {
            this.item = new Item();
        }

        public static ItemBuilder builder() {
            return new ItemBuilder();
        }

        public Item build() {
            return this.item;
        }

        public ItemBuilder setId(int id) {
            this.item.id = id;
            return this;
        }

        public ItemBuilder setCost(double cost) {
            this.item.cost = cost;
            return this;
        }

        public ItemBuilder setName(String name) {
            this.item.name = name;
            return this;
        }

        public ItemBuilder setDescription(String description) {
            this.item.description = description;
            return this;
        }
    }
}

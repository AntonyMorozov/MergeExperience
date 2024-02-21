package by.javaguru.git.mergeexperience.topics;

public enum Module3Topics {
    HIBERNATE(1, "HIBERNATE", "Введение в HIBERNATE"),
    OBJECTS_IN_HIBERNATE(2, "Objects in HIBERNATE", "Работа с объектами в HIBERNATE"),
    OBJECT_RELATIONAL_MODEL(3, "Object-relational model", "Основы отображения объектно-реляционной модели"),
    CLASS_HIERARCHY(4, "Class hierarchy", "Отображение иерархии классов"),
    RELATIONSHIP(5, "Relationships", "Отображение отношений"),
    HQL_JPQL(6, "HQL/JPQL", "Объектно-ориентированный языек запросов"),
    CRITERIA_JPA(7, "CRITERIA JPA", "Запросы CRITERIA JPA"),
    TRANSACTIONS_AND_CONCURRENCY(8, "Transactions and concurrency", "Транзакции и параллелизм");

    private int order;
    private String topic;
    private String desc;

    Module3Topics(int order, String topic, String desc) {
        this.order = order;
        this.topic = topic;
        this.desc = desc;
    }

    public int getOrder() {
        return order;
    }

    public String getTopic() {
        return topic;
    }

    public String getDesc() {
        return desc;
    }
}

package final_project;

import java.util.ArrayList;
import java.util.List;

class StudentOrganization {
    private String organizationName;
    private String organizationHead;
    private List<Student> organizationMembers;

    // Список наблюдателей
    private List<OrganizationObserver> observers = new ArrayList<>();

    public StudentOrganization(String organizationName, String organizationHead) {
        this.organizationName = organizationName;
        this.organizationHead = organizationHead;
        this.organizationMembers = new ArrayList<>();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationHead() {
        return organizationHead;
    }

    public void setOrganizationHead(String organizationHead) {
        this.organizationHead = organizationHead;
    }

    public List<Student> getOrganizationMembers() {
        return organizationMembers;
    }

    public void addOrganizationMember(Student student) {
        if (!organizationMembers.contains(student)) {
            organizationMembers.add(student);
            notifyMemberAdded(student); // Уведомление наблюдателей
        }
    }

    public void removeOrganizationMember(Student student) {
        if (organizationMembers.remove(student)) {
            notifyMemberRemoved(student); // Уведомление наблюдателей
        }
    }

    // Методы для управления наблюдателями
    public void registerObserver(OrganizationObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void unregisterObserver(OrganizationObserver observer) {
        observers.remove(observer);
    }

    // Приватные методы для уведомления наблюдателей
    private void notifyMemberAdded(Student student) {
        for (OrganizationObserver observer : observers) {
            observer.memberAdded(student);
        }
    }

    private void notifyMemberRemoved(Student student) {
        for (OrganizationObserver observer : observers) {
            observer.memberRemoved(student);
        }
    }
}

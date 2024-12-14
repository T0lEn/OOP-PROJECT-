package final_project;

public class Request {
    private String request;
    private String sender;
    private String receiver;
    private boolean isCanceled;

    // Конструктор
    public Request(String request, String sender, String receiver) {
        this.request = request;
        this.sender = sender;
        this.receiver = receiver;
        this.isCanceled = false; // По умолчанию запрос не отменен
    }

    // Метод для получения текста запроса
    public String getRequest() {
        return request;
    }

    public boolean isCanceled() {
        return isCanceled;
    }

    // Метод для отправки запроса
    public void sendRequest() {
        if (isCanceled) {
            System.out.println("Request cannot be sent because it has been canceled.");
        } else {
            System.out.println("Request sent from " + sender + " to " + receiver + ": " + request);
        }
    }

    // Метод для обновления текста запроса
    public void updateRequest(String newRequest) {
        if (isCanceled) {
            System.out.println("Request cannot be updated because it has been canceled.");
        } else {
            this.request = newRequest;
            System.out.println("Request updated to: " + newRequest);
        }
    }

    // Метод для отмены запроса
    public void cancelRequest() {
        isCanceled = true;
        System.out.println("Request has been canceled.");
    }

    // Метод toString для отображения информации о запросе
    @Override
    public String toString() {
        return "Request Details: [Request='" + request + '\'' +
                ", Sender='" + sender + '\'' +
                ", Receiver='" + receiver + '\'' +
                ", Status=" + (isCanceled ? "Canceled" : "Active") +
                ']';
    }
}

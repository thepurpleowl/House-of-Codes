#include<stdio.h>
#include<stdlib.h>

// Structure for a node in the SLL
struct Node {
    int data;
    struct Node* next;
};

// Function to create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Function to add a node at the beginning
void addAtBegin(struct Node** head, int data) {
    struct Node* newNode = createNode(data);
    newNode->next = *head;
    *head = newNode;
    printf("Node added at the beginning!\n");
}

// Function to add a node at the end
void addAtEnd(struct Node** head, int data) {
    struct Node* newNode = createNode(data);
    if (*head == NULL) {
        *head = newNode;
        printf("Node added at the end!\n");
        return;
    }
    struct Node* temp = *head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newNode;
    printf("Node added at the end!\n");
}

// Function to add a node in between at a specified position
void addAtPosition(struct Node** head, int data, int pos) {
    struct Node* newNode = createNode(data);
    if (pos == 1) {
        newNode->next = *head;
        *head = newNode;
        printf("Node added at position %d!\n", pos);
        return;
    }
    struct Node* temp = *head;
    for (int i = 1; i < pos - 1 && temp != NULL; i++) {
        temp = temp->next;
    }
    if (temp == NULL) {
        printf("Position out of bounds!\n");
    } else {
        newNode->next = temp->next;
        temp->next = newNode;
        printf("Node added at position %d!\n", pos);
    }
}

// Function to delete a node from the beginning
void deleteAtBegin(struct Node** head) {
    if (*head == NULL) {
        printf("List is empty!\n");
        return;
    }
    struct Node* temp = *head;
    *head = (*head)->next;
    free(temp);
    printf("Node deleted from the beginning!\n");
}

// Function to delete a node from the end
void deleteAtEnd(struct Node** head) {
    if (*head == NULL) {
        printf("List is empty!\n");
        return;
    }
    struct Node* temp = *head;
    if (temp->next == NULL) {
        *head = NULL;
        free(temp);
        printf("Node deleted from the end!\n");
        return;
    }
    while (temp->next->next != NULL) {
        temp = temp->next;
    }
    struct Node* lastNode = temp->next;
    temp->next = NULL;
    free(lastNode);
    printf("Node deleted from the end!\n");
}

// Function to delete a node at a specific position
void deleteAtPosition(struct Node** head, int pos) {
    if (*head == NULL) {
        printf("List is empty!\n");
        return;
    }
    struct Node* temp = *head;
    if (pos == 1) {
        *head = (*head)->next;
        free(temp);
        printf("Node deleted from position %d!\n", pos);
        return;
    }
    for (int i = 1; i < pos - 1 && temp != NULL; i++) {
        temp = temp->next;
    }
    if (temp == NULL || temp->next == NULL) {
        printf("Position out of bounds!\n");
    } else {
        struct Node* nodeToDelete = temp->next;
        temp->next = temp->next->next;
        free(nodeToDelete);
        printf("Node deleted from position %d!\n", pos);
    }
}

// Function to search for a node with a specific value
void searchNode(struct Node* head, int data) {
    struct Node* temp = head;
    int pos = 1;
    while (temp != NULL) {
        if (temp->data == data) {
            printf("Node with value %d found at position %d!\n", data, pos);
            return;
        }
        temp = temp->next;
        pos++;
    }
    printf("Node with value %d not found!\n", data);
}

// Function to display the linked list
void displayList(struct Node* head) {
    if (head == NULL) {
        printf("List is empty!\n");
        return;
    }
    struct Node* temp = head;
    printf("Linked List: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Function to display the linked list in a pictorial format
void displayPictorialList(struct Node* head) {
    if (head == NULL) {
        printf("List is empty!\n");
        return;
    }
    struct Node* temp = head;
    printf("\nPictorial Representation of Linked List:\n");
    while (temp != NULL) {
        printf("[ %d | %p ] --> ", temp->data, (void*)temp->next);
        temp = temp->next;
    }
    printf("NULL\n\n");
}

// Menu function 
void menu() {
    printf("\n********** Singly Linked List Operations **********\n");
    printf("1. Add node at the beginning\n");
    printf("2. Add node at the end\n");
    printf("3. Add node at a specific position\n");
    printf("4. Delete node from the beginning\n");
    printf("5. Delete node from the end\n");
    printf("6. Delete node from a specific position\n");
    printf("7. Search for a node\n");
    printf("8. Display the linked list\n");
    printf("9. Display the linked list (pictorial representation)\n");
    printf("10. Exit\n");
    printf("Enter your choice: ");
}

int main() {
    struct Node* head = NULL;
    int choice, data, pos;

    while (1) {
        menu();
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the data to add at the beginning: ");
                scanf("%d", &data);
                addAtBegin(&head, data);
                break;
            case 2:
                printf("Enter the data to add at the end: ");
                scanf("%d", &data);
                addAtEnd(&head, data);
                break;
            case 3:
                printf("Enter the data to add: ");
                scanf("%d", &data);
                printf("Enter the position: ");
                scanf("%d", &pos);
                addAtPosition(&head, data, pos);
                break;
            case 4:
                deleteAtBegin(&head);
                break;
            case 5:
                deleteAtEnd(&head);
                break;
            case 6:
                printf("Enter the position to delete: ");
                scanf("%d", &pos);
                deleteAtPosition(&head, pos);
                break;
            case 7:
                printf("Enter the value to search: ");
                scanf("%d", &data);
                searchNode(head, data);
                break;
            case 8:
                displayList(head);
                break;
            case 9:
                displayPictorialList(head);
                break;
            case 10:
                printf("Exiting...\n");
                exit(0);
                break;
            default:
                printf("Invalid choice! Try again.\n");
        }
    }

    return 0;
}

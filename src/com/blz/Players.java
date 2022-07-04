package com.blz;

public class Players extends CardDeck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cards = CardDeck.setDeck();

		String[][] cardsShuf = shuffleCards(cards);

		Players p1 = new Players(cardsShuf[0][0], cardsShuf[0][1], cardsShuf[0][2], cardsShuf[0][3], cardsShuf[0][4],
				cardsShuf[0][5], cardsShuf[0][6], cardsShuf[0][7], cardsShuf[0][8]);
		Players p2 = new Players(cardsShuf[0][9], cardsShuf[0][10], cardsShuf[0][11], cardsShuf[0][12], cardsShuf[1][0],
				cardsShuf[1][1], cardsShuf[1][2], cardsShuf[1][3], cardsShuf[1][4]);
		Players p3 = new Players(cardsShuf[1][5], cardsShuf[1][6], cardsShuf[1][7], cardsShuf[1][8], cardsShuf[1][9],
				cardsShuf[1][10], cardsShuf[1][11], cardsShuf[1][12], cardsShuf[2][0]);
		Players p4 = new Players(cardsShuf[2][1], cardsShuf[2][2], cardsShuf[2][3], cardsShuf[2][4], cardsShuf[2][5],
				cardsShuf[2][6], cardsShuf[2][7], cardsShuf[2][8], cardsShuf[2][9]);

		p1.display("Player One");
		p2.display("Player Two");
		p3.display("Player Three");
		p4.display("Player Four");

	}

	String card1, card2, card3, card4, card5, card6, card7, card8, card9;

	Players(String c1, String c2, String c3, String c4, String c5, String c6, String c7, String c8, String c9) {
		this.card1 = c1;
		enqueue(this.card1);
		this.card2 = c2;
		enqueue(this.card2);
		this.card3 = c3;
		enqueue(this.card3);
		this.card4 = c4;
		enqueue(this.card4);
		this.card5 = c5;
		enqueue(this.card5);
		this.card6 = c6;
		enqueue(this.card6);
		this.card7 = c7;
		enqueue(this.card7);
		this.card8 = c8;
		enqueue(this.card8);
		this.card9 = c9;
		enqueue(this.card9);

	}

	static class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	Node head;

	void enqueue(Object data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void display(String playerName) {
		if (head == null)
			System.out.println("No Card");
		else if (head.next == null)
			System.out.println(head.data);
		else {
			Node temp = head;
			System.out.println(playerName + "'s Cards : ");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

		}
		System.out.println("");
	}

}

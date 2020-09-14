package com.twu.refactoring;

public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
	}

	public String printReceipt() {
		StringBuilder output = new StringBuilder();

		final String header="======Printing Orders======\n";
		output.append(header);

        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());

		printsLineItems(output);
		return output.toString();
	}

	private void printsLineItems(StringBuilder output) {
		double totSalesTx = 0d;
		double tot = 0d;
		for (LineItem lineItem : order.getLineItems()) {
			traversalPrintLineItems(output, lineItem);

			// calculate sales tax @ rate of 10%
			final double taxRate = .10;
			double salesTax = lineItem.totalAmount() * taxRate;
            totSalesTx += salesTax;

            // calculate total amount of lineItem = price * quantity + 10 % sales tax
            tot += lineItem.totalAmount() + salesTax;
		}

		// prints the state tax
		output.append("Sales Tax").append('\t').append(totSalesTx);

		// print total amount
		output.append("Total Amount").append('\t').append(tot);
	}

	private void traversalPrintLineItems(StringBuilder output, LineItem lineItem) {
		output.append(lineItem.getDescription());
		output.append('\t');
		output.append(lineItem.getPrice());
		output.append('\t');
		output.append(lineItem.getQuantity());
		output.append('\t');
		output.append(lineItem.totalAmount());
		output.append('\n');
	}
}
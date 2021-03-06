package com.niit.project.model;

import java.io.Serializable;

public class CheckoutDetails implements Serializable {
	private static final long serialVersionUID = 1L;
		private CreditCard cardDetail;
		private ShippingAddress shippingAddress;
		private BillingAddress billingAddress;
		private OrderDetail orderDetail;
		private OrderedItems orderedItems;
		private Cart cart;
		private CartItem cartItem;
		private Customer customer;

		public CreditCard getCardDetail()
		{
			return cardDetail;
		}

		public void setCardDetail(CreditCard cardDetail) {
			this.cardDetail = cardDetail;
		}

		public ShippingAddress getShippingAddress() {
			return shippingAddress;
		}

		public void setShippingAddress(ShippingAddress shippingAddress) {
			this.shippingAddress = shippingAddress;
		}

		public BillingAddress getBillingAddress() {
			return billingAddress;
		}

		public void setBillingAddress(BillingAddress billingAddress) {
			this.billingAddress = billingAddress;
		}

		public OrderDetail getOrderDetail() {
			return orderDetail;
		}

		public void setOrderDetail(OrderDetail orderDetail) {
			this.orderDetail = orderDetail;
		}

		public OrderedItems getOrderedItems() {
			return orderedItems;
		}

		public void setOrderedItems(OrderedItems orderedItems) {
			this.orderedItems = orderedItems;
		}

		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}

		public CartItem getCartItem() {
			return cartItem;
		}

		public void setCartItem(CartItem cartItem) {
			this.cartItem = cartItem;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		

	}



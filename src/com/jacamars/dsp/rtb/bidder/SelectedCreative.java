package com.jacamars.dsp.rtb.bidder;

import com.jacamars.dsp.rtb.common.Campaign;
import com.jacamars.dsp.rtb.common.Creative;
import com.jacamars.dsp.rtb.pojo.Impression;

/**
 * A class that is used to hold a campaign and the associated creative that matches a bid request. Used by the
 * CampaignProcessor to return the campaign+creative pair, which will then be used by the CampaignSelector to
 * make the BidResponse.
 * @author Ben M. Faul
 *
 */

public class SelectedCreative {
	Impression impression;
	public String dealId;
	public double price;
	public String impid;
	/** The campaign of the selection */
	Campaign campaign;
	/** The creative within the campaign that was selected */
	Creative creative;
	/** The adjusted weight, applied from an algorithm */
	int weight;
	
	/**
	 * Return the campaign of the selection.
	 * @return Campaign. The campaign.
	 */
	public Campaign getCampaign() {
		return campaign;
	}

	/**
	 * Returns the Creative that was selected out of the campaign
	 * @return Creative. The selected creative.
	 */
	public Creative getCreative() {
		return creative;
	}

	public double getPrice() {
		return price;
	}
	
	public String getDealId() {
		return dealId;
	}
	
	/**
	 * Assign a campaign
	 * @param campaign Campaign - the campaign to assign.
	 */
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	/**
	 * Assign the creative
	 * @param creative Creative. The creative to assign.
	 */
	public void setCreative(Creative creative) { this.creative = creative; }
	
	public SelectedCreative(Creative creative,  String dealId, double price, String impid) {
		this.creative = creative;
		this.dealId = dealId;
		this.price = price;
		this.impid = impid;
	}
	
	public void setImpression(Impression imp) {
		impression = imp;
	}
	
	public Impression getImpression() {
		return impression;
	}

	public int getWeight() { return creative.weight; }

	public void setWeight(int weight) {
	    this.weight = weight;
    }
}

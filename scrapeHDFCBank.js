const request = require('request');
const cheerio = require('cheerio');
const fs = require('fs');
const csvWriter = require('csv-writer').createObjectCsvWriter;
const url = 'https://www.hdfcbank.com/personal/pay/cards/credit-cards';
request(url, (error, response, body) => {
  if (!error && response.statusCode === 200) {
    const $ = cheerio.load(body);


    const cardDetails = [];


    const cardContainer = $('.benefits-card-row');


    cardContainer.each((index, element) => {

      const cardName = $(element).find('.benefits-card-name').text().trim();
      const cardFee = $(element).find('.benefits-joining-fee').text().trim();
      const rewardPoints = $(element).find('.benefits-reward-points').text().trim();
      const loungeAccess = $(element).find('.benefits-lounge-access').text().trim();
      const milestoneBenefit = $(element).find('.benefits-milestone-benefit').text().trim();
      const cardFeeReversal = $(element).find('.benefits-card-fee-reversal').text().trim();


      cardDetails.push({
        'Card Name': cardName,
        'Card Fee': cardFee,
        'Reward Points/Percentage per 100 Spent': rewardPoints,
        'Lounge Access': loungeAccess,
        'Milestone Benefit': milestoneBenefit,
        'Card Fee Reversal Condition': cardFeeReversal,
      });
    });


    const csvWriterObj = csvWriter({
      path: 'hdfc_credit_cards.csv',
      header: [
        { id: 'Card Name', title: 'Card Name' },
        { id: 'Card Fee', title: 'Card Fee' },
        { id: 'Reward Points/Percentage per 100 Spent', title: 'Reward Points/Percentage per 100 Spent' },
        { id: 'Lounge Access', title: 'Lounge Access' },
        { id: 'Milestone Benefit', title: 'Milestone Benefit' },
        { id: 'Card Fee Reversal Condition', title: 'Card Fee Reversal Condition' },
      ],
    });


    csvWriterObj
      .writeRecords(cardDetails)
      .then(() => console.log('CSV file successfully written.'))
      .catch((err) => console.error(err));
  } else {
    console.error('Error:', error);
  }
});

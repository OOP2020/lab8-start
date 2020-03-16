## Unit Tests for Auction

The Auction class contains several variants, most of which contain defects.
You can select whcih auction type (variant) to use by calling `auction.setAuctionType(int n)` with n = 1, ..., 7.  Each variant contains different defects, but at least one variant *should* be bug-free.  

Write unit tests for auction and document what defects you find in the table below.

See links below for more information, including how to automate testing using *parameterized tests*. 


## Description of Defects

Include the name of your tests and description of the defect.

| AuctionType | Failing Unit Test | Description of Defect                 |
|-------------|:------------------|:--------------------------------------|
|     1       | testBidWhenAuctionStopped | Bids re accepted when auction is stopped |
|     2       | testSomethingElse | Auction accepts a new bid lower than previous best bid. |


## References

[Lab 8 Labsheet](https://skeoop.github.io/labs/Lab8-AuctionTest.pdf)

[Parameterized Unit Tests](https://skeoop.github.io/unittesting/Parameterized-Tests)

Bank Account
============

Some sample code that breaks the Law of Demeter.

It can be used as an alternative "Connect" exercise for this [Learning Hour on the Law of Demeter](https://www.sammancoaching.org/learning_hours/refactoring/law_of_demeter.html). Show the code in Bank Account and ask "What could go wrong?". Hopefully they will spot the public field. Then follow up by asking "What is encapsulation?"

Then in the concept part of the Learning Hour you can show the code in CashMachine and ask "What could go wrong?". Hopefully they will spot the [MessageChain](https://www.sammancoaching.org/code_smells/message_chains.html) code smell. Follow up with "What is Coupling?". Then you can explain what that is and how it relates to the Law of Demeter.

Another way to get the concept accross is to ask people to modify the code. It's necessary to make a change to the interface of PersonalAccountsManager. When you call "GetAccountForCustomer" it is going to be necessary to pass the name of the branch manager as well as the name of the customer. This branch manager is available from the Branch. The point is, that in order to make this change you have to edit the CashMachine class which actually shouldn't really care about this. The fact that it does is a sign of poor design. You're doing [Shotgun Surgery](https://www.sammancoaching.org/code_smells/shotgun_surgery.html).

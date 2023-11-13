---
layout: page
title: Zhetao's Project Portfolio Page
---

### Project: WellNUS

WellNUS is a desktop application used by NUS Counsellors to manage and schedule appointments with their student clients.
The user interacts with it using a CLI, and it has a GUI created with JavaFX.

Summary of Contributions:

* **Enhancements implemented:**
   
1. Created the functionality to view appointments
    * Added a second column to allow viewing of students and appointments concurrently. [#79](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/79)
    * Added a view command that can handle the displaying of both students and appointments. This involved creating new Ui elements
      such as AppointmentListCard that shows the details of an appointment. [#92](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/92)
    * Adding test cases for the new ViewCommand and ViewCommand parser. [#98](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/98)

2. Added the functionality to store and load appointments from the json file [#102](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/102)
    * Added JsonAdaptedAppointment to handle the storing and loading of appointments to persist the data
    * Added Test Cases for this new functionality of loading appointment [#129](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/129)

3. Added the functionality to filter appointments based on filtered students [#145](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/145)
    * Created predicates necessary to filter the UniqueAppointmentList
    * Enhanced find feature to include the said functionality
    * Add test cases for the improved find command [#153](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/153)

4. Added view notes functionality
    * Added a third column dedicated to displaying a student note (which can be a paragraph long)
    * Added double-click functionality on student card to display the student notes, including the design of displaying of student notes

5. Implemented TypicalWellNus which serves as the default set of data for testing [#153](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/153)

6. Fix edit command
    * Remove name parameter from Edit Command as a person's name should not change [#171](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/171)
    * Remove risk parameter from Edit Command as it is handled by tag command [#253](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/253)

7. Fix bugs
    * Fix invalid note stored crashing the application [#249](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/249)
    * Fix note panel details persisting after different commands [#252](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/252)

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2324s1.github.io/tp-dashboard/?search=quzhetao01&breakdown=true)


* **Documentation**:
    * User Guide:
        * Updated UG skeleton to replace AB3 [#34](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/34)
        * Added user guide for view feature [#153](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/153)
        * Added user guide for find feature [#145](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/145)
        * Added details on how to view student notes [#252](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/252)
    * Developer Guide:
        * Added Use Cases UC01 and UC02 [#49](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/49)
        * Added implementation details of the view feature, including a ViewSequenceDiagram and ViewActivityDiagram [#135](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/135), updated it on [#254](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/254)
            

* **Contributions to team-based tasks**
1. Managed the closing of milestone 1.2 and 1.3
2. Refactored terms with "AddressBook" by replacing it with "WellNUS" [#92](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/92) [#129](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/129)
   * Many original files and classes were named based off AddressBook such as "JSONSerializableAddressBook". Our application we design
     is not an addressbook, therefore we decide to do away inaccuracy of having "addressbook" in our classes and files.
   * Ensuring that pull requests of other members are tagged to the relevant issues and helping to close issues when they are done

* **Review/mentoring contributions**
    * PRs reviewed: [#80](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/80),
    [#83](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/83),
    [#85](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/85),
    [#88](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/88),
    [#90](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/90),
    [#95](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/95),
    [#96](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/96),
    [#99](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/99),
    [#101](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/101),
    [#103](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/103),
    [#104](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/104),
    [#109](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/109),
    [#112](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/112),
    [#113](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/113),
    [#126](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/126),
    [#127](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/127),
    [#131](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/131),
    [#136](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/136),
    [#143](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/143),
    [#152](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/152),
    [#162](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/162),
    [#164](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/164),
    [#172](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/172),
    [#173](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/173),
    [#174](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/174),
    [#238](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/238),
    [#239](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/239),
    [#242](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/242),


* **Contributions beyond project team**
    * Gave my thoughts on how to resolve a bug I had reported for another group I was reviewing for. [PR Link](https://github.com/AY2324S1-CS2103T-T13-2/tp/issues/180#event-10920070185)

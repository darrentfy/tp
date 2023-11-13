---
layout: page
title: Stephen's Project Portfolio Page
---

### Project: WellNUS

WellNUS is a desktop application used by NUS Counsellors to manage and schedule appointments with their student clients.
The user interacts with it using a CLI, and it has a GUI created with JavaFX.

Summary of Contributions:

* **Enhancements implemented:**

1. Refactored Tag class into RiskLevel class. 
   * Allows for Students to be assigned to a certain Risk Level determined by the counsellor. [#94](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/94)
   * Limited the size of RiskLevel to 1 by implementing a LimitedHashSet class. [#99](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/99)
   * Added functionality to tag students to risk levels. [#149](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/149)
   * Updated test cases accordingly. [#112](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/112)
   
2. Implemented check overlapping appointments feature
   * WellNUS detects any overlapping/clashing appointments everytime a new appointment is scheduled. [#158](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/158)
   * Also include check when loading from the WellNUS storage. [#235](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/235)
   * Updating test cases to reflect this was tricky. ModelStub and other classes had to be modified to adjust for the new dependency. [#158](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/158)

3. Implemented check student exists for appointment feature
   * WellNUS ensures the student exists in the database for the appointment created. [#160](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/160)

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2324s1.github.io/tp-dashboard/?search=sheeepen&breakdown=true)

* **Documentation**:
    * User Guide:
      * Constantly updated command summary table [#53](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/53), [#65](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/65)
      * Added View Students, Delete Students sections [#57](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/57)
      * Updated with new `Tag` command for RiskLevel [#157](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/157)
      * Added the constraints table for all prefixes and parameters [#237](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/237)
      * Enhanced visuals [#237](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/237)
    * Developer Guide:
      * Updated NFR and Glossary [#33](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/33)
      * Updated User Stories [#109](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/109)
      * Added UML diagrams for check overlapping appointments feature. [#137](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/137)

* **Contributions to team-based tasks**
  * Concluded v1.2 postmortem and demo screenshots
  * Handled submissions for various deadlines
  * Standardised formatting and language use in User Guide
* **Review/mentoring contributions**
  * PRs reviewed: [#88](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/88),
    [#90](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/90),
    [#92](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/92),
    [#98](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/98),
    [#99](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/99),
    [#102](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/102),
    [#104](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/104),
    [#113](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/113),
    [#114](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/114),
    [#125](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/125),
    [#126](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/126),
    [#135](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/135),
    [#154](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/154),
    [#155](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/155),
    [#161](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/161),
    [#167](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/167),
    [#238](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/238),
    [#252](https://github.com/AY2324S1-CS2103T-W13-4/tp/pull/252)



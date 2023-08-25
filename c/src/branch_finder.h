#ifndef CASHMACHINE_BRANCH_FINDER_H
#define CASHMACHINE_BRANCH_FINDER_H

typedef struct Branch {
    int town_id;
} Branch;

Branch* find_branch_for_town(int town_id);

#endif //CASHMACHINE_BRANCH_FINDER_H

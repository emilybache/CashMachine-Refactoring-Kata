set(SRC_LIB_NAME src)
set(SOURCES sample.c cash_machine.c branch_finder.c personal_accounts.c account.c cash.c)
add_library(${SRC_LIB_NAME} ${SOURCES})
target_sources(${SRC_LIB_NAME} PRIVATE ${SOURCES})
target_include_directories(${SRC_LIB_NAME} PUBLIC ${CMAKE_CURRENT_SOURCE_DIR})

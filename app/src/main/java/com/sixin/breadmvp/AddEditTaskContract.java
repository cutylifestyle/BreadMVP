package com.sixin.breadmvp;

public interface AddEditTaskContract {

    interface Presenter extends BasePresenter{

        void saveTask(String title, String description);

        void populateTask();

        boolean isDataMissing();
    }

    interface View extends BaseView<Presenter>{

        void showEmptyTaskError();

        void showTasksList();

        //设置标题
        void setTitle(String title);

        void setDescription(String description);

        boolean isActive();
    }

}

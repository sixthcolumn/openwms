class WorkTaskName < ActiveRecord::Base

  self.table_name = "work_task_names"

  belongs_to :work_task_name_type, foreign_key:  "name_type_id"

  belongs_to :work_task
end

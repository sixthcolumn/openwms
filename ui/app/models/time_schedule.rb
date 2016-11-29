class TimeSchedule < ActiveRecord::Base

  self.table_name = "time_schedule"


  has_and_belongs_to_many  :work_orders, join_table: "work_order_schedules"
  has_and_belongs_to_many  :work_tasks, join_table: "work_task_time_schedules"

end

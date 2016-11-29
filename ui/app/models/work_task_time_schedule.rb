class WorkTaskTimeSchedule < ActiveRecord::Base
  self.table_name = "work_task_time_schedules"

  belongs_to :work_task
  belongs_to :time_schedule
end

class WorkOrderSchedule < ActiveRecord::Base
  self.table_name = "work_order_schedules"

  belongs_to :work_order

  belongs_to :time_schedule
end

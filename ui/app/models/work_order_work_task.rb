class WorkOrderWorkTask < ActiveRecord::Base
  belongs_to :work_order
  belongs_to :work_task
end

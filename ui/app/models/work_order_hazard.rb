class WorkOrderHazard < ActiveRecord::Base
  belongs_to :work_order
  belongs_to :hazard
end

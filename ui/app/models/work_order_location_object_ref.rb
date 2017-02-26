class WorkOrderLocationObjectRef < ActiveRecord::Base
  belongs_to :work_order
  belongs_to :loc_ref_object
end

class WorkOrderName < ActiveRecord::Base

  self.table_name = "work_order_names"

  belongs_to :work_order_name_type, foreign_key:  "name_type_id"
  belongs_to :work_order
end

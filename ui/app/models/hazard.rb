class Hazard < ActiveRecord::Base

  self.table_name = "hazards"

  has_and_belongs_to_many  :work_orders, join_table: "work_order_hazards"

end

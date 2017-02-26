class Comment < ActiveRecord::Base

  self.table_name = "comment"

  has_and_belongs_to_many  :work_orders, join_table: "work_order_comments"
end

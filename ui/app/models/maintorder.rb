class Maintorder < ActiveRecord::Base
  self.table_name = "maintorder"

  has_many :maintorder_names
  has_many :work_orders
end

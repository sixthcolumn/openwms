class Proced < ActiveRecord::Base
   self.table_name = "proced"

  has_and_belongs_to_many  :assets, join_table: "asset_proceds"
  has_and_belongs_to_many  :measurements, join_table: "proced_measurements"


end

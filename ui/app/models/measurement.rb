class Measurement < ActiveRecord::Base
   self.table_name = "measurement"

  has_and_belongs_to_many  :proceds, join_table: "proced_measurements"

end

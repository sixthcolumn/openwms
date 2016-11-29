class ProcedMeasurement < ActiveRecord::Base
  self.table_name = "proced_measurements"

  belongs_to :proced
  belongs_to :measurement
end

class MaintorderName < ActiveRecord::Base

  self.table_name = "maintorder_names"

  belongs_to :maintorder
  belongs_to :maintorder_name_type, foreign_key: "name_type_id"
end

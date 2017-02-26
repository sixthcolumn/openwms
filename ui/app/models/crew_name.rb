class CrewName < ActiveRecord::Base
  self.table_name = "crew_names"

  belongs_to :crew
  belongs_to :crew_name_type, foreign_key:  "name_type_id"

end

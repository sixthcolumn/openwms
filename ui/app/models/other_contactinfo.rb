class OtherContactinfo < ActiveRecord::Base

   self.table_name = "other_contactinfo"

   has_and_belongs_to_many  :contactpeople, join_table: "contactperson_other_contactinfos"
end

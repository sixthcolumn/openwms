class Nametype < ActiveRecord::Base

  self.table_name = "nametype"


  belongs_to :name_type_authority
end

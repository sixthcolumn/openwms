class OrganizationName < ActiveRecord::Base

  self.table_name = "organization_names"

  belongs_to :organization
  belongs_to :organization_name_type, foreign_key: "name_type_id"
end

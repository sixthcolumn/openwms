class WorkOrderOrganization < ActiveRecord::Base
  belongs_to :work_order
  belongs_to :organization
end

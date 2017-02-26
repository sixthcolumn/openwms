class Organization < ActiveRecord::Base

  self.table_name="organization"
  
  belongs_to :address
  belongs_to :phone

  has_and_belongs_to_many  :work_orders, join_table: "work_order_orgs"

  has_many :organization_names



end

class Asset < ActiveRecord::Base
  self.table_name = "asset"

  belongs_to :address

  has_and_belongs_to_many  :work_tasks, join_table: "work_task_assets"
  has_and_belongs_to_many  :crews, join_table: "crew_assets"
  has_and_belongs_to_many  :proceds, join_table: "asset_proceds"
  
  has_many   :asset_names


end

class Crew < ActiveRecord::Base

  self.table_name = "crew"

  has_and_belongs_to_many  :work_tasks, join_table: "work_task_crews"
  has_many :crew_names
  has_and_belongs_to_many  :assets, join_table: "crew_assets"


end

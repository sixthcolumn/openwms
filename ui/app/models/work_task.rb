class WorkTask < ActiveRecord::Base
  self.table_name = "work_task"

  belongs_to :asset, class_name: "Asset", foreign_key: "old_asset_id"

  has_many :work_task_names
  has_and_belongs_to_many  :work_orders, join_table: "work_order_work_tasks"
  has_and_belongs_to_many  :time_schedules, join_table: "work_task_time_schedules"
  has_and_belongs_to_many  :assets, join_table: "work_task_assets"

  has_and_belongs_to_many  :crews, join_table: "work_task_crews"


end

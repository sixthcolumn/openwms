class WorkTaskMaterialItem < ActiveRecord::Base
  belongs_to :work_task
  belongs_to :material_item
end

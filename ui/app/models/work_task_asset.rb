class WorkTaskAsset < ActiveRecord::Base
  belongs_to :work_task
  belongs_to :asset
end

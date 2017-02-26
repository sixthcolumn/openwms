class MaterialItemName < ActiveRecord::Base
  belongs_to :material_item
  belongs_to :name_type
end

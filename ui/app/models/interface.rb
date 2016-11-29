class Interface < ActiveRecord::Base
  belongs_to :package
  belongs_to :vendor_role_type
end

package com.epam.khalii.ooptask.TaskGod;

import java.util.Random;

/**
 * Created by Anhelina_Khalii on 24.04.2015.
 */
public class Woman extends Human {
    final protected boolean gender = false;

    public Woman(boolean gender, String lastName, String firstName, float height, float weight) {
        super(lastName, firstName, height, weight);
    }

    public Human giveBirth(Man partner){
        boolean s=false;
        Random r = new Random();
        if(r.nextDouble()<0.5)
            s = true;
        /**
         * � ������, ��� ���� ������� ����, ���� �������������� ����� ������� ���������. �� ����� ��������� ����������:
         ������� ����� ��������� ������� ��� ������� � ������������ 0.5 �� ���������� ����������:
         - ��� (String) - ������ � �������
         - ������� (String) - ������� � ���������� � ������� �����
         - ���� (float) - ���������� � ���������������� ���������� � ����� �� ����� + 0.1*(���� ���������� ���������������� ���� ����� ���� ����������� ����������)
         - ��� (float) - ���������� �����
         � ���������� ������ ��������� ���� ������ �� ����� ��� �������� ������ ���������� �������� ��� �������� ������� �� �����... ������������. ���������� ������ ������� ����������� ������� ������ � ������ ������������ ������� �� ����� ������������ � ��������.

         *
         *
         * */
    }
}
